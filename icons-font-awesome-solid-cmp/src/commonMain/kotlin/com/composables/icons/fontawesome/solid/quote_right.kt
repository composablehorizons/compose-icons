package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.QuoteRight: ImageVector
    get() {
        if (_QuoteRight != null) return _QuoteRight!!
        
        _QuoteRight = ImageVector.Builder(
            name = "quote-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 32f)
                horizontalLineTo(336f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 35.3f, -28.7f, 64f, -64f, 64f)
                horizontalLineToRelative(-8f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(8f)
                curveToRelative(88.4f, 0f, 160f, -71.6f, 160f, -160f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-288f, 0f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 35.3f, -28.7f, 64f, -64f, 64f)
                horizontalLineToRelative(-8f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(8f)
                curveToRelative(88.4f, 0f, 160f, -71.6f, 160f, -160f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _QuoteRight!!
    }

private var _QuoteRight: ImageVector? = null

