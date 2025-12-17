package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FilePdf: ImageVector
    get() {
        if (_FilePdf != null) return _FilePdf!!
        
        _FilePdf = ImageVector.Builder(
            name = "file-pdf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(181.9f, 256.1f)
                curveToRelative(-5f, -16f, -4.9f, -46.9f, -2f, -46.9f)
                curveToRelative(8.4f, 0f, 7.6f, 36.9f, 2f, 46.9f)
                close()
                moveToRelative(-1.7f, 47.2f)
                curveToRelative(-7.7f, 20.2f, -17.3f, 43.3f, -28.4f, 62.7f)
                curveToRelative(18.3f, -7f, 39f, -17.2f, 62.9f, -21.9f)
                curveToRelative(-12.7f, -9.6f, -24.9f, -23.4f, -34.5f, -40.8f)
                close()
                moveTo(86.1f, 428.1f)
                curveToRelative(0f, 0.8f, 13.2f, -5.4f, 34.9f, -40.2f)
                curveToRelative(-6.7f, 6.3f, -29.1f, 24.5f, -34.9f, 40.2f)
                close()
                moveTo(248f, 160f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(328f)
                curveToRelative(0f, 13.3f, -10.7f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineTo(24f)
                curveTo(0f, 10.7f, 10.7f, 0f, 24f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(136f)
                curveToRelative(0f, 13.2f, 10.8f, 24f, 24f, 24f)
                close()
                moveToRelative(-8f, 171.8f)
                curveToRelative(-20f, -12.2f, -33.3f, -29f, -42.7f, -53.8f)
                curveToRelative(4.5f, -18.5f, 11.6f, -46.6f, 6.2f, -64.2f)
                curveToRelative(-4.7f, -29.4f, -42.4f, -26.5f, -47.8f, -6.8f)
                curveToRelative(-5f, 18.3f, -0.4f, 44.1f, 8.1f, 77f)
                curveToRelative(-11.6f, 27.6f, -28.7f, 64.6f, -40.8f, 85.8f)
                curveToRelative(-0.1f, 0f, -0.1f, 0.1f, -0.2f, 0.1f)
                curveToRelative(-27.1f, 13.9f, -73.6f, 44.5f, -54.5f, 68f)
                curveToRelative(5.6f, 6.9f, 16f, 10f, 21.5f, 10f)
                curveToRelative(17.9f, 0f, 35.7f, -18f, 61.1f, -61.8f)
                curveToRelative(25.8f, -8.5f, 54.1f, -19.1f, 79f, -23.2f)
                curveToRelative(21.7f, 11.8f, 47.1f, 19.5f, 64f, 19.5f)
                curveToRelative(29.2f, 0f, 31.2f, -32f, 19.7f, -43.4f)
                curveToRelative(-13.9f, -13.6f, -54.3f, -9.7f, -73.6f, -7.2f)
                close()
                moveTo(377f, 105f)
                lineTo(279f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
                moveToRelative(-74.1f, 255.3f)
                curveToRelative(4.1f, -2.7f, -2.5f, -11.9f, -42.8f, -9f)
                curveToRelative(37.1f, 15.8f, 42.8f, 9f, 42.8f, 9f)
                close()
            }
        }.build()
        
        return _FilePdf!!
    }

private var _FilePdf: ImageVector? = null

