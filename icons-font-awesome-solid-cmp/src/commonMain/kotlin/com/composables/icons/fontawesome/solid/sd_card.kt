package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SdCard: ImageVector
    get() {
        if (_SdCard != null) return _SdCard!!
        
        _SdCard = ImageVector.Builder(
            name = "sd-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 0f)
                horizontalLineTo(128f)
                lineTo(0f, 128f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 35.3f, 28.7f, 64f, 64f, 64f)
                horizontalLineToRelative(256f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
                moveTo(160f, 160f)
                horizontalLineToRelative(-48f)
                verticalLineTo(64f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(-48f)
                verticalLineTo(64f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(-48f)
                verticalLineTo(64f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(96f)
                close()
            }
        }.build()
        
        return _SdCard!!
    }

private var _SdCard: ImageVector? = null

