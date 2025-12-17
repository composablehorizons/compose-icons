package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HeadSideVirus: ImageVector
    get() {
        if (_HeadSideVirus != null) return _HeadSideVirus!!
        
        _HeadSideVirus = ImageVector.Builder(
            name = "head-side-virus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 240f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 272f, 240f)
                close()
                moveToRelative(-64f, -64f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 208f, 176f)
                close()
                moveToRelative(301.2f, 99f)
                curveToRelative(-20.93f, -47.12f, -48.43f, -151.73f, -73.07f, -186.75f)
                arcTo(207.9f, 207.9f, 0f, false, false, 266.09f, 0f)
                horizontalLineTo(192f)
                curveTo(86f, 0f, 0f, 86f, 0f, 192f)
                arcTo(191.23f, 191.23f, 0f, false, false, 64f, 334.81f)
                verticalLineTo(512f)
                horizontalLineTo(320f)
                verticalLineTo(448f)
                horizontalLineToRelative(64f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, -64f)
                verticalLineTo(320f)
                horizontalLineTo(480f)
                arcTo(32f, 32f, 0f, false, false, 509.2f, 275f)
                close()
                moveTo(368f, 240f)
                horizontalLineTo(355.88f)
                curveToRelative(-28.51f, 0f, -42.79f, 34.47f, -22.63f, 54.63f)
                lineToRelative(8.58f, 8.57f)
                arcToRelative(16f, 16f, 0f, true, true, -22.63f, 22.63f)
                lineToRelative(-8.57f, -8.58f)
                curveTo(290.47f, 297.09f, 256f, 311.37f, 256f, 339.88f)
                verticalLineTo(352f)
                arcToRelative(16f, 16f, 0f, false, true, -32f, 0f)
                verticalLineTo(339.88f)
                curveToRelative(0f, -28.51f, -34.47f, -42.79f, -54.63f, -22.63f)
                lineToRelative(-8.57f, 8.58f)
                arcToRelative(16f, 16f, 0f, false, true, -22.63f, -22.63f)
                lineToRelative(8.58f, -8.57f)
                curveToRelative(20.16f, -20.16f, 5.88f, -54.63f, -22.63f, -54.63f)
                horizontalLineTo(112f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, -32f)
                horizontalLineToRelative(12.12f)
                curveToRelative(28.51f, 0f, 42.79f, -34.47f, 22.63f, -54.63f)
                lineToRelative(-8.58f, -8.57f)
                arcToRelative(16f, 16f, 0f, false, true, 22.63f, -22.63f)
                lineToRelative(8.57f, 8.58f)
                curveToRelative(20.16f, 20.16f, 54.63f, 5.88f, 54.63f, -22.63f)
                verticalLineTo(96f)
                arcToRelative(16f, 16f, 0f, false, true, 32f, 0f)
                verticalLineToRelative(12.12f)
                curveToRelative(0f, 28.51f, 34.47f, 42.79f, 54.63f, 22.63f)
                lineToRelative(8.57f, -8.58f)
                arcToRelative(16f, 16f, 0f, false, true, 22.63f, 22.63f)
                lineToRelative(-8.58f, 8.57f)
                curveTo(313.09f, 173.53f, 327.37f, 208f, 355.88f, 208f)
                horizontalLineTo(368f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, 32f)
                close()
            }
        }.build()
        
        return _HeadSideVirus!!
    }

private var _HeadSideVirus: ImageVector? = null

