package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Replace_image: ImageVector
    get() {
        if (_Replace_image != null) return _Replace_image!!
        
        _Replace_image = ImageVector.Builder(
            name = "replace_image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(463f, 726f)
                lineToRelative(-23f, -31f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-24f, 33f)
                quadToRelative(-8f, 10f, -2f, 21f)
                reflectiveQuadToRelative(18f, 11f)
                horizontalLineToRelative(159f)
                quadToRelative(13f, 0f, 18.5f, -11f)
                reflectiveQuadToRelative(-2.5f, -21f)
                lineToRelative(-39f, -51f)
                quadToRelative(-6f, -8f, -15.5f, -8.5f)
                reflectiveQuadTo(505f, 676f)
                lineToRelative(-42f, 50f)
                close()
                moveTo(320f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 400f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(480f, -560f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineToRelative(36f)
                quadToRelative(-39f, -39f, -90f, -59.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-71f, 0f, -133f, 33.5f)
                reflectiveQuadTo(247f, 285f)
                quadToRelative(-14f, 20f, -30f, 23f)
                reflectiveQuadToRelative(-30f, -4f)
                quadToRelative(-14f, -7f, -19.5f, -21f)
                reflectiveQuadToRelative(2.5f, -27f)
                quadToRelative(48f, -81f, 130.5f, -128.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(82f, 0f, 155.5f, 35f)
                reflectiveQuadTo(760f, 214f)
                verticalLineToRelative(-94f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 120f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 320f)
                close()
            }
        }.build()
        
        return _Replace_image!!
    }

private var _Replace_image: ImageVector? = null

