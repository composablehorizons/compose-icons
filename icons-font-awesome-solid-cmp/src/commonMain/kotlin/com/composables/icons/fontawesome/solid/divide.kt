package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Divide: ImageVector
    get() {
        if (_Divide != null) return _Divide!!
        
        _Divide = ImageVector.Builder(
            name = "divide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 352f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-28.65f, -64f, -64f, -64f)
                close()
                moveToRelative(0f, -192f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-28.65f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                close()
                moveToRelative(192f, 48f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(384f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Divide!!
    }

private var _Divide: ImageVector? = null

