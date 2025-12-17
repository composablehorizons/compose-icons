package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Local_drink: ImageVector
    get() {
        if (_Local_drink != null) return _Local_drink!!
        
        _Local_drink = ImageVector.Builder(
            name = "local_drink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2f)
                lineToRelative(2.01f, 18.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22f, 7f, 22f)
                horizontalLineToRelative(10f)
                curveToRelative(1.03f, 0f, 1.87f, -0.77f, 1.99f, -1.77f)
                lineTo(21f, 2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(9f, 17f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -2f, 3f, -5.4f, 3f, -5.4f)
                reflectiveCurveToRelative(3f, 3.4f, 3f, 5.4f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                close()
                moveToRelative(6.33f, -11f)
                horizontalLineTo(5.67f)
                lineToRelative(-0.44f, -4f)
                horizontalLineToRelative(13.53f)
                lineToRelative(-0.43f, 4f)
                close()
            }
        }.build()
        
        return _Local_drink!!
    }

private var _Local_drink: ImageVector? = null

