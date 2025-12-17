package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Joint: ImageVector
    get() {
        if (_Joint != null) return _Joint!!
        
        _Joint = ImageVector.Builder(
            name = "joint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(444.34f, 181.1f)
                curveToRelative(22.38f, 15.68f, 35.66f, 41.16f, 35.66f, 68.59f)
                verticalLineTo(280f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineToRelative(-30.31f)
                curveToRelative(0f, -43.24f, -21.01f, -83.41f, -56.34f, -108.06f)
                curveTo(463.85f, 125.02f, 448f, 99.34f, 448f, 70.31f)
                verticalLineTo(8f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                verticalLineToRelative(66.4f)
                curveToRelative(0f, 43.69f, 24.56f, 81.63f, 60.34f, 106.7f)
                close()
                moveTo(194.97f, 358.98f)
                curveTo(126.03f, 370.07f, 59.69f, 394.69f, 0f, 432f)
                curveToRelative(83.65f, 52.28f, 180.3f, 80f, 278.94f, 80f)
                horizontalLineToRelative(88.57f)
                lineTo(254.79f, 380.49f)
                curveToRelative(-14.74f, -17.2f, -37.45f, -25.11f, -59.82f, -21.51f)
                close()
                moveTo(553.28f, 87.09f)
                curveToRelative(-5.67f, -3.8f, -9.28f, -9.96f, -9.28f, -16.78f)
                verticalLineTo(8f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                verticalLineToRelative(62.31f)
                curveToRelative(0f, 22.02f, 10.17f, 43.41f, 28.64f, 55.39f)
                curveTo(550.79f, 153.04f, 576f, 199.54f, 576f, 249.69f)
                verticalLineTo(280f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineToRelative(-30.31f)
                curveToRelative(0f, -65.44f, -32.41f, -126.19f, -86.72f, -162.6f)
                close()
                moveTo(360.89f, 352.05f)
                curveToRelative(-34.4f, 0.06f, -86.81f, 0.15f, -88.21f, 0.17f)
                lineToRelative(117.8f, 137.43f)
                arcTo(63.987f, 63.987f, 0f, false, false, 439.07f, 512f)
                horizontalLineToRelative(88.45f)
                lineTo(409.57f, 374.4f)
                arcToRelative(63.955f, 63.955f, 0f, false, false, -48.68f, -22.35f)
                close()
                moveTo(616f, 352f)
                horizontalLineTo(432f)
                lineToRelative(117.99f, 137.65f)
                arcTo(63.987f, 63.987f, 0f, false, false, 598.58f, 512f)
                horizontalLineTo(616f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineTo(376f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _Joint!!
    }

private var _Joint: ImageVector? = null

