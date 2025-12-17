package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FilePdf: ImageVector
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
                moveTo(369.9f, 97.9f)
                lineTo(286f, 14f)
                curveTo(277f, 5f, 264.8f, -0.1f, 252.1f, -0.1f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(131.9f)
                curveToRelative(0f, -12.7f, -5.1f, -25f, -14.1f, -34f)
                close()
                moveTo(332.1f, 128f)
                horizontalLineTo(256f)
                verticalLineTo(51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48f, 464f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(288f)
                horizontalLineTo(48f)
                close()
                moveToRelative(250.2f, -143.7f)
                curveToRelative(-12.2f, -12f, -47f, -8.7f, -64.4f, -6.5f)
                curveToRelative(-17.2f, -10.5f, -28.7f, -25f, -36.8f, -46.3f)
                curveToRelative(3.9f, -16.1f, 10.1f, -40.6f, 5.4f, -56f)
                curveToRelative(-4.2f, -26.2f, -37.8f, -23.6f, -42.6f, -5.9f)
                curveToRelative(-4.4f, 16.1f, -0.4f, 38.5f, 7f, 67.1f)
                curveToRelative(-10f, 23.9f, -24.9f, 56f, -35.4f, 74.4f)
                curveToRelative(-20f, 10.3f, -47f, 26.2f, -51f, 46.2f)
                curveToRelative(-3.3f, 15.8f, 26f, 55.2f, 76.1f, -31.2f)
                curveToRelative(22.4f, -7.4f, 46.8f, -16.5f, 68.4f, -20.1f)
                curveToRelative(18.9f, 10.2f, 41f, 17f, 55.8f, 17f)
                curveToRelative(25.5f, 0f, 28f, -28.2f, 17.5f, -38.7f)
                close()
                moveToRelative(-198.1f, 77.8f)
                curveToRelative(5.1f, -13.7f, 24.5f, -29.5f, 30.4f, -35f)
                curveToRelative(-19f, 30.3f, -30.4f, 35.7f, -30.4f, 35f)
                close()
                moveToRelative(81.6f, -190.6f)
                curveToRelative(7.4f, 0f, 6.7f, 32.1f, 1.8f, 40.8f)
                curveToRelative(-4.4f, -13.9f, -4.3f, -40.8f, -1.8f, -40.8f)
                close()
                moveToRelative(-24.4f, 136.6f)
                curveToRelative(9.7f, -16.9f, 18f, -37f, 24.7f, -54.7f)
                curveToRelative(8.3f, 15.1f, 18.9f, 27.2f, 30.1f, 35.5f)
                curveToRelative(-20.8f, 4.3f, -38.9f, 13.1f, -54.8f, 19.2f)
                close()
                moveToRelative(131.6f, -5f)
                reflectiveCurveToRelative(-5f, 6f, -37.3f, -7.8f)
                curveToRelative(35.1f, -2.6f, 40.9f, 5.4f, 37.3f, 7.8f)
                close()
            }
        }.build()
        
        return _FilePdf!!
    }

private var _FilePdf: ImageVector? = null

