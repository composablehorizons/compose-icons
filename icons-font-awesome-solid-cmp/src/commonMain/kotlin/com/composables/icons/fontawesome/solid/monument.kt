package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Monument: ImageVector
    get() {
        if (_Monument != null) return _Monument!!
        
        _Monument = ImageVector.Builder(
            name = "monument",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(352f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(-78.86f, -347.26f)
                arcToRelative(31.97f, 31.97f, 0f, false, false, -9.21f, -19.44f)
                lineTo(203.31f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineToRelative(-76.6f, 76.61f)
                arcToRelative(31.97f, 31.97f, 0f, false, false, -9.21f, 19.44f)
                lineTo(64f, 416f)
                horizontalLineToRelative(256f)
                lineToRelative(-30.86f, -315.26f)
                close()
                moveTo(240f, 307.2f)
                curveToRelative(0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineToRelative(-70.4f)
                curveToRelative(-6.4f, 0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineToRelative(-38.4f)
                curveToRelative(0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(70.4f)
                curveToRelative(6.4f, 0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(38.4f)
                close()
            }
        }.build()
        
        return _Monument!!
    }

private var _Monument: ImageVector? = null

