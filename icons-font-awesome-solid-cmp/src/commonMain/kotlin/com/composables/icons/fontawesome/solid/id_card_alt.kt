package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.IdCardAlt: ImageVector
    get() {
        if (_IdCardAlt != null) return _IdCardAlt!!
        
        _IdCardAlt = ImageVector.Builder(
            name = "id-card-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 64f)
                horizontalLineTo(384f)
                verticalLineToRelative(96f)
                horizontalLineTo(192f)
                verticalLineTo(64f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(288f, 224f)
                curveToRelative(35.3f, 0f, 64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.7f, -64f, -64f)
                reflectiveCurveToRelative(28.7f, -64f, 64f, -64f)
                close()
                moveToRelative(93.3f, 224f)
                horizontalLineTo(194.7f)
                curveToRelative(-10.4f, 0f, -18.8f, -10f, -15.6f, -19.8f)
                curveToRelative(8.3f, -25.6f, 32.4f, -44.2f, 60.9f, -44.2f)
                horizontalLineToRelative(8.2f)
                curveToRelative(12.3f, 5.1f, 25.7f, 8f, 39.8f, 8f)
                reflectiveCurveToRelative(27.6f, -2.9f, 39.8f, -8f)
                horizontalLineToRelative(8.2f)
                curveToRelative(28.4f, 0f, 52.5f, 18.5f, 60.9f, 44.2f)
                curveToRelative(3.2f, 9.8f, -5.2f, 19.8f, -15.6f, 19.8f)
                close()
                moveTo(352f, 32f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(128f)
                verticalLineTo(32f)
                close()
            }
        }.build()
        
        return _IdCardAlt!!
    }

private var _IdCardAlt: ImageVector? = null

