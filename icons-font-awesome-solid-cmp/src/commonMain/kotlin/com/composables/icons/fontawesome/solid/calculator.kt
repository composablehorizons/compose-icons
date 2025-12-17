package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Calculator: ImageVector
    get() {
        if (_Calculator != null) return _Calculator!!
        
        _Calculator = ImageVector.Builder(
            name = "calculator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 0f)
                horizontalLineTo(48f)
                curveTo(22.4f, 0f, 0f, 22.4f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 25.6f, 22.4f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(25.6f, 0f, 48f, -22.4f, 48f, -48f)
                verticalLineTo(48f)
                curveToRelative(0f, -25.6f, -22.4f, -48f, -48f, -48f)
                close()
                moveTo(128f, 435.2f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineTo(76.8f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineToRelative(-38.4f)
                curveToRelative(0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(38.4f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineTo(76.8f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineToRelative(-38.4f)
                curveToRelative(0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(38.4f)
                close()
                moveToRelative(128f, 128f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineToRelative(-38.4f)
                curveToRelative(0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(38.4f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineToRelative(-38.4f)
                curveToRelative(0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(38.4f)
                close()
                moveToRelative(128f, 128f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineTo(268.8f)
                curveToRelative(0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(166.4f)
                close()
                moveToRelative(0f, -256f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineTo(76.8f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineTo(76.8f)
                curveTo(64f, 70.4f, 70.4f, 64f, 76.8f, 64f)
                horizontalLineToRelative(294.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(102.4f)
                close()
            }
        }.build()
        
        return _Calculator!!
    }

private var _Calculator: ImageVector? = null

