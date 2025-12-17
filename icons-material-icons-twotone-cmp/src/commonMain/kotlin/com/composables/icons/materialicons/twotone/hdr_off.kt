package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hdr_off: ImageVector
    get() {
        if (_Hdr_off != null) return _Hdr_off!!
        
        _Hdr_off = ImageVector.Builder(
            name = "hdr_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.5f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2f)
                horizontalLineTo(21f)
                lineToRelative(-0.9f, -2.1f)
                curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(16f)
                verticalLineToRelative(4.86f)
                lineTo(17.14f, 15f)
                horizontalLineToRelative(0.36f)
                close()
                moveToRelative(0f, -4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-4.5f, 0f)
                verticalLineToRelative(0.36f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(10.5f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineTo(13f)
                close()
                moveTo(2.51f, 2.49f)
                lineTo(1.45f, 3.55f)
                lineTo(6.9f, 9f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineToRelative(-4.9f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(3.4f)
                lineToRelative(7.6f, 7.6f)
                lineToRelative(1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _Hdr_off!!
    }

private var _Hdr_off: ImageVector? = null

