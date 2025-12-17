package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Edit: ImageVector
    get() {
        if (_Edit != null) return _Edit!!
        
        _Edit = ImageVector.Builder(
            name = "edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402.6f, 83.2f)
                lineToRelative(90.2f, 90.2f)
                curveToRelative(3.8f, 3.8f, 3.8f, 10f, 0f, 13.8f)
                lineTo(274.4f, 405.6f)
                lineToRelative(-92.8f, 10.3f)
                curveToRelative(-12.4f, 1.4f, -22.9f, -9.1f, -21.5f, -21.5f)
                lineToRelative(10.3f, -92.8f)
                lineTo(388.8f, 83.2f)
                curveToRelative(3.8f, -3.8f, 10f, -3.8f, 13.8f, 0f)
                close()
                moveToRelative(162f, -22.9f)
                lineToRelative(-48.8f, -48.8f)
                curveToRelative(-15.2f, -15.2f, -39.9f, -15.2f, -55.2f, 0f)
                lineToRelative(-35.4f, 35.4f)
                curveToRelative(-3.8f, 3.8f, -3.8f, 10f, 0f, 13.8f)
                lineToRelative(90.2f, 90.2f)
                curveToRelative(3.8f, 3.8f, 10f, 3.8f, 13.8f, 0f)
                lineToRelative(35.4f, -35.4f)
                curveToRelative(15.2f, -15.3f, 15.2f, -40f, 0f, -55.2f)
                close()
                moveTo(384f, 346.2f)
                verticalLineTo(448f)
                horizontalLineTo(64f)
                verticalLineTo(128f)
                horizontalLineToRelative(229.8f)
                curveToRelative(3.2f, 0f, 6.2f, -1.3f, 8.5f, -3.5f)
                lineToRelative(40f, -40f)
                curveToRelative(7.6f, -7.6f, 2.2f, -20.5f, -8.5f, -20.5f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(306.2f)
                curveToRelative(0f, -10.7f, -12.9f, -16f, -20.5f, -8.5f)
                lineToRelative(-40f, 40f)
                curveToRelative(-2.2f, 2.3f, -3.5f, 5.3f, -3.5f, 8.5f)
                close()
            }
        }.build()
        
        return _Edit!!
    }

private var _Edit: ImageVector? = null

