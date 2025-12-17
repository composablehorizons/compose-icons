package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileMedical: ImageVector
    get() {
        if (_FileMedical != null) return _FileMedical!!
        
        _FileMedical = ImageVector.Builder(
            name = "file-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(377f, 105f)
                lineTo(279.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(256f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
                moveToRelative(-153f, 31f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(64f, 160f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                close()
            }
        }.build()
        
        return _FileMedical!!
    }

private var _FileMedical: ImageVector? = null

