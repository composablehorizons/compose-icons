package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileExcel: ImageVector
    get() {
        if (_FileExcel != null) return _FileExcel!!
        
        _FileExcel = ImageVector.Builder(
            name = "file-excel",
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
                moveToRelative(212f, -240f)
                horizontalLineToRelative(-28.8f)
                curveToRelative(-4.4f, 0f, -8.4f, 2.4f, -10.5f, 6.3f)
                curveToRelative(-18f, 33.1f, -22.2f, 42.4f, -28.6f, 57.7f)
                curveToRelative(-13.9f, -29.1f, -6.9f, -17.3f, -28.6f, -57.7f)
                curveToRelative(-2.1f, -3.9f, -6.2f, -6.3f, -10.6f, -6.3f)
                horizontalLineTo(124f)
                curveToRelative(-9.3f, 0f, -15f, 10f, -10.4f, 18f)
                lineToRelative(46.3f, 78f)
                lineToRelative(-46.3f, 78f)
                curveToRelative(-4.7f, 8f, 1.1f, 18f, 10.4f, 18f)
                horizontalLineToRelative(28.9f)
                curveToRelative(4.4f, 0f, 8.4f, -2.4f, 10.5f, -6.3f)
                curveToRelative(21.7f, -40f, 23f, -45f, 28.6f, -57.7f)
                curveToRelative(14.9f, 30.2f, 5.9f, 15.9f, 28.6f, 57.7f)
                curveToRelative(2.1f, 3.9f, 6.2f, 6.3f, 10.6f, 6.3f)
                horizontalLineTo(260f)
                curveToRelative(9.3f, 0f, 15f, -10f, 10.4f, -18f)
                lineTo(224f, 320f)
                curveToRelative(0.7f, -1.1f, 30.3f, -50.5f, 46.3f, -78f)
                curveToRelative(4.7f, -8f, -1.1f, -18f, -10.3f, -18f)
                close()
            }
        }.build()
        
        return _FileExcel!!
    }

private var _FileExcel: ImageVector? = null

