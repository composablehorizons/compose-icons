package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShieldVirus: ImageVector
    get() {
        if (_ShieldVirus != null) return _ShieldVirus!!
        
        _ShieldVirus = ImageVector.Builder(
            name = "shield-virus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 192f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 224f, 192f)
                close()
                moveTo(466.5f, 83.68f)
                lineToRelative(-192f, -80f)
                arcTo(57.4f, 57.4f, 0f, false, false, 256.05f, 0f)
                arcToRelative(57.4f, 57.4f, 0f, false, false, -18.46f, 3.67f)
                lineToRelative(-192f, 80f)
                arcTo(47.93f, 47.93f, 0f, false, false, 16f, 128f)
                curveTo(16f, 326.5f, 130.5f, 463.72f, 237.5f, 508.32f)
                arcToRelative(48.09f, 48.09f, 0f, false, false, 36.91f, 0f)
                curveTo(360.09f, 472.61f, 496f, 349.3f, 496f, 128f)
                arcTo(48f, 48f, 0f, false, false, 466.5f, 83.68f)
                close()
                moveTo(384f, 256f)
                horizontalLineTo(371.88f)
                curveToRelative(-28.51f, 0f, -42.79f, 34.47f, -22.63f, 54.63f)
                lineToRelative(8.58f, 8.57f)
                arcToRelative(16f, 16f, 0f, true, true, -22.63f, 22.63f)
                lineToRelative(-8.57f, -8.58f)
                curveTo(306.47f, 313.09f, 272f, 327.37f, 272f, 355.88f)
                verticalLineTo(368f)
                arcToRelative(16f, 16f, 0f, false, true, -32f, 0f)
                verticalLineTo(355.88f)
                curveToRelative(0f, -28.51f, -34.47f, -42.79f, -54.63f, -22.63f)
                lineToRelative(-8.57f, 8.58f)
                arcToRelative(16f, 16f, 0f, false, true, -22.63f, -22.63f)
                lineToRelative(8.58f, -8.57f)
                curveToRelative(20.16f, -20.16f, 5.88f, -54.63f, -22.63f, -54.63f)
                horizontalLineTo(128f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, -32f)
                horizontalLineToRelative(12.12f)
                curveToRelative(28.51f, 0f, 42.79f, -34.47f, 22.63f, -54.63f)
                lineToRelative(-8.58f, -8.57f)
                arcToRelative(16f, 16f, 0f, false, true, 22.63f, -22.63f)
                lineToRelative(8.57f, 8.58f)
                curveToRelative(20.16f, 20.16f, 54.63f, 5.88f, 54.63f, -22.63f)
                verticalLineTo(112f)
                arcToRelative(16f, 16f, 0f, false, true, 32f, 0f)
                verticalLineToRelative(12.12f)
                curveToRelative(0f, 28.51f, 34.47f, 42.79f, 54.63f, 22.63f)
                lineToRelative(8.57f, -8.58f)
                arcToRelative(16f, 16f, 0f, false, true, 22.63f, 22.63f)
                lineToRelative(-8.58f, 8.57f)
                curveTo(329.09f, 189.53f, 343.37f, 224f, 371.88f, 224f)
                horizontalLineTo(384f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, 32f)
                close()
                moveToRelative(-96f, 0f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 288f, 256f)
                close()
            }
        }.build()
        
        return _ShieldVirus!!
    }

private var _ShieldVirus: ImageVector? = null

