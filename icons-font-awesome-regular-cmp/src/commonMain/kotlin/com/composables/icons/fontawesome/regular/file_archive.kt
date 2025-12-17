package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileArchive: ImageVector
    get() {
        if (_FileArchive != null) return _FileArchive!!
        
        _FileArchive = ImageVector.Builder(
            name = "file-archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128.3f, 160f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-32f)
                close()
                moveToRelative(64f, -96f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                close()
                moveToRelative(-64f, 32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                verticalLineTo(96f)
                close()
                moveToRelative(64f, 32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                close()
                moveToRelative(177.6f, -30.1f)
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
                moveTo(256f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                horizontalLineTo(256f)
                close()
                moveTo(336f, 464f)
                horizontalLineTo(48f)
                verticalLineTo(48f)
                horizontalLineToRelative(79.7f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(32f)
                verticalLineTo(48f)
                horizontalLineTo(208f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                close()
                moveTo(194.2f, 265.7f)
                curveToRelative(-1.1f, -5.6f, -6f, -9.7f, -11.8f, -9.7f)
                horizontalLineToRelative(-22.1f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                lineToRelative(-19.7f, 97.1f)
                curveTo(102f, 385.6f, 126.8f, 416f, 160f, 416f)
                curveToRelative(33.1f, 0f, 57.9f, -30.2f, 51.5f, -62.6f)
                close()
                moveToRelative(-33.9f, 124.4f)
                curveToRelative(-17.9f, 0f, -32.4f, -12.1f, -32.4f, -27f)
                reflectiveCurveToRelative(14.5f, -27f, 32.4f, -27f)
                reflectiveCurveToRelative(32.4f, 12.1f, 32.4f, 27f)
                reflectiveCurveToRelative(-14.5f, 27f, -32.4f, 27f)
                close()
                moveToRelative(32f, -198.1f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                close()
            }
        }.build()
        
        return _FileArchive!!
    }

private var _FileArchive: ImageVector? = null

