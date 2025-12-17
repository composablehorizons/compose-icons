package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StoreAlt: ImageVector
    get() {
        if (_StoreAlt != null) return _StoreAlt!!
        
        _StoreAlt = ImageVector.Builder(
            name = "store-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 384f)
                horizontalLineTo(128f)
                verticalLineTo(224f)
                horizontalLineTo(64f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(224f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(314.6f, -241.8f)
                lineToRelative(-85.3f, -128f)
                curveToRelative(-6f, -8.9f, -16f, -14.2f, -26.7f, -14.2f)
                horizontalLineTo(117.4f)
                curveToRelative(-10.7f, 0f, -20.7f, 5.3f, -26.6f, 14.2f)
                lineToRelative(-85.3f, 128f)
                curveToRelative(-14.2f, 21.3f, 1f, 49.8f, 26.6f, 49.8f)
                horizontalLineTo(608f)
                curveToRelative(25.5f, 0f, 40.7f, -28.5f, 26.6f, -49.8f)
                close()
                moveTo(512f, 496f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(224f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(272f)
                close()
            }
        }.build()
        
        return _StoreAlt!!
    }

private var _StoreAlt: ImageVector? = null

