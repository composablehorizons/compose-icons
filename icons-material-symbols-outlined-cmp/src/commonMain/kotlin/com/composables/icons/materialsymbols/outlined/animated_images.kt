package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Animated_images: ImageVector
    get() {
        if (_Animated_images != null) return _Animated_images!!
        
        _Animated_images = ImageVector.Builder(
            name = "animated_images",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 540f)
                lineToRelative(240f, -160f)
                lineToRelative(-240f, -160f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(33f, 220f)
                horizontalLineToRelative(219f)
                quadToRelative(-6f, 24f, -24f, 41.5f)
                reflectiveQuadTo(664f, 822f)
                lineTo(228f, 875f)
                quadToRelative(-33f, 4f, -59.5f, -16f)
                reflectiveQuadTo(138f, 806f)
                lineTo(86f, 368f)
                quadToRelative(-4f, -33f, 16.5f, -59f)
                reflectiveQuadToRelative(53.5f, -30f)
                lineToRelative(45f, -5f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 4f)
                lineToRelative(54f, 438f)
                lineToRelative(294f, -36f)
                close()
                moveToRelative(-152f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(281f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(361f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(881f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(801f, 680f)
                horizontalLineTo(361f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(361f)
                verticalLineToRelative(440f)
                close()
                moveTo(219f, 796f)
                close()
                moveToRelative(362f, -416f)
                close()
            }
        }.build()
        
        return _Animated_images!!
    }

private var _Animated_images: ImageVector? = null

