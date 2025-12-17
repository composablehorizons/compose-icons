package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileArchive: ImageVector
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
                moveTo(377f, 105f)
                lineTo(279.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(256f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
                moveTo(128.4f, 336f)
                curveToRelative(-17.9f, 0f, -32.4f, 12.1f, -32.4f, 27f)
                curveToRelative(0f, 15f, 14.6f, 27f, 32.5f, 27f)
                reflectiveCurveToRelative(32.4f, -12.1f, 32.4f, -27f)
                reflectiveCurveToRelative(-14.6f, -27f, -32.5f, -27f)
                close()
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineToRelative(-63.6f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
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
                moveTo(95.9f, 32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                close()
                moveToRelative(32.3f, 384f)
                curveToRelative(-33.2f, 0f, -58f, -30.4f, -51.4f, -62.9f)
                lineTo(96.4f, 256f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-32f)
                verticalLineTo(96f)
                horizontalLineToRelative(32f)
                verticalLineTo(64f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(22.1f)
                curveToRelative(5.7f, 0f, 10.7f, 4.1f, 11.8f, 9.7f)
                lineToRelative(17.3f, 87.7f)
                curveToRelative(6.4f, 32.4f, -18.4f, 62.6f, -51.4f, 62.6f)
                close()
            }
        }.build()
        
        return _FileArchive!!
    }

private var _FileArchive: ImageVector? = null

