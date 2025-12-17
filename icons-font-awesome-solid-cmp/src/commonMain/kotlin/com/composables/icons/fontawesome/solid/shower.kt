package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Shower: ImageVector
    get() {
        if (_Shower != null) return _Shower!!
        
        _Shower = ImageVector.Builder(
            name = "shower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(304f, 320f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 304f, 320f)
                close()
                moveToRelative(32f, -96f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 336f, 224f)
                close()
                moveToRelative(32f, 64f)
                arcToRelative(16f, 16f, 0f, true, false, -16f, -16f)
                arcTo(16f, 16f, 0f, false, false, 368f, 288f)
                close()
                moveToRelative(-32f, 32f)
                arcToRelative(16f, 16f, 0f, true, false, -16f, -16f)
                arcTo(16f, 16f, 0f, false, false, 336f, 320f)
                close()
                moveToRelative(-32f, -64f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 304f, 256f)
                close()
                moveToRelative(128f, -32f)
                arcToRelative(16f, 16f, 0f, true, false, -16f, -16f)
                arcTo(16f, 16f, 0f, false, false, 432f, 224f)
                close()
                moveToRelative(-48f, 16f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, -16f)
                arcTo(16f, 16f, 0f, false, false, 384f, 240f)
                close()
                moveToRelative(-16f, -48f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 368f, 192f)
                close()
                moveToRelative(96f, 32f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 464f, 224f)
                close()
                moveToRelative(32f, -32f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 496f, 192f)
                close()
                moveToRelative(-64f, 64f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 432f, 256f)
                close()
                moveToRelative(-32f, 32f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 400f, 288f)
                close()
                moveToRelative(-64f, 64f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 336f, 352f)
                close()
                moveToRelative(-32f, 32f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 304f, 384f)
                close()
                moveToRelative(64f, -64f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 368f, 320f)
                close()
                moveToRelative(21.65f, -218.35f)
                lineToRelative(-11.3f, -11.31f)
                arcToRelative(16f, 16f, 0f, false, false, -22.63f, 0f)
                lineTo(350.05f, 96f)
                arcTo(111.19f, 111.19f, 0f, false, false, 272f, 64f)
                curveToRelative(-19.24f, 0f, -37.08f, 5.3f, -52.9f, 13.85f)
                lineToRelative(-10f, -10f)
                arcTo(121.72f, 121.72f, 0f, false, false, 123.44f, 32f)
                curveTo(55.49f, 31.5f, 0f, 92.91f, 0f, 160.85f)
                verticalLineTo(464f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(158.4f)
                curveToRelative(0f, -30.15f, 21f, -58.2f, 51f, -61.93f)
                arcToRelative(58.38f, 58.38f, 0f, false, true, 48.93f, 16.67f)
                lineToRelative(10f, 10f)
                curveTo(165.3f, 138.92f, 160f, 156.76f, 160f, 176f)
                arcToRelative(111.23f, 111.23f, 0f, false, false, 32f, 78.05f)
                lineToRelative(-5.66f, 5.67f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, 22.62f)
                lineToRelative(11.3f, 11.31f)
                arcToRelative(16f, 16f, 0f, false, false, 22.63f, 0f)
                lineTo(389.65f, 124.28f)
                arcTo(16f, 16f, 0f, false, false, 389.65f, 101.65f)
                close()
            }
        }.build()
        
        return _Shower!!
    }

private var _Shower: ImageVector? = null

