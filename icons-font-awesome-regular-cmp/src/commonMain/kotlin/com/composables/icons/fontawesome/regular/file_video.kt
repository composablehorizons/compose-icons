package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileVideo: ImageVector
    get() {
        if (_FileVideo != null) return _FileVideo!!
        
        _FileVideo = ImageVector.Builder(
            name = "file-video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(369.941f, 97.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48f, 48f, 0f, false, false, 252.118f, 0f)
                horizontalLineTo(48f)
                curveTo(21.49f, 0f, 0f, 21.49f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(131.882f)
                arcToRelative(48f, 48f, 0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(332.118f, 128f)
                horizontalLineTo(256f)
                verticalLineTo(51.882f)
                lineTo(332.118f, 128f)
                close()
                moveTo(48f, 464f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(288f)
                horizontalLineTo(48f)
                close()
                moveToRelative(228.687f, -211.303f)
                lineTo(224f, 305.374f)
                verticalLineTo(268f)
                curveToRelative(0f, -11.046f, -8.954f, -20f, -20f, -20f)
                horizontalLineTo(100f)
                curveToRelative(-11.046f, 0f, -20f, 8.954f, -20f, 20f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 11.046f, 8.954f, 20f, 20f, 20f)
                horizontalLineToRelative(104f)
                curveToRelative(11.046f, 0f, 20f, -8.954f, 20f, -20f)
                verticalLineToRelative(-37.374f)
                lineToRelative(52.687f, 52.674f)
                curveTo(286.704f, 397.318f, 304f, 390.28f, 304f, 375.986f)
                verticalLineTo(264.011f)
                curveToRelative(0f, -14.311f, -17.309f, -21.319f, -27.313f, -11.314f)
                close()
            }
        }.build()
        
        return _FileVideo!!
    }

private var _FileVideo: ImageVector? = null

