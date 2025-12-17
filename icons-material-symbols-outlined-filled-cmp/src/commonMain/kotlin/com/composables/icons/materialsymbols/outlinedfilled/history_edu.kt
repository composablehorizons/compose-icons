package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.History_edu: ImageVector
    get() {
        if (_History_edu != null) return _History_edu!!
        
        _History_edu = ImageVector.Builder(
            name = "history_edu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-90f)
                quadToRelative(-35f, -2f, -66.5f, -15.5f)
                reflectiveQuadTo(236f, 454f)
                verticalLineToRelative(-44f)
                horizontalLineToRelative(-46f)
                lineTo(60f, 280f)
                quadToRelative(36f, -46f, 89f, -65f)
                reflectiveQuadToRelative(107f, -19f)
                quadToRelative(27f, 0f, 52.5f, 4f)
                reflectiveQuadToRelative(51.5f, 15f)
                verticalLineToRelative(-55f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(320f)
                close()
                moveToRelative(120f, -200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 680f)
                verticalLineToRelative(-440f)
                horizontalLineTo(440f)
                verticalLineToRelative(24f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(-56f)
                lineTo(510f, 446f)
                lineToRelative(-8f, 8f)
                quadToRelative(-14f, 14f, -29.5f, 25f)
                reflectiveQuadTo(440f, 496f)
                verticalLineToRelative(104f)
                close()
                moveTo(224f, 330f)
                horizontalLineToRelative(92f)
                verticalLineToRelative(86f)
                quadToRelative(12f, 8f, 25f, 11f)
                reflectiveQuadToRelative(27f, 3f)
                quadToRelative(23f, 0f, 41.5f, -7f)
                reflectiveQuadToRelative(36.5f, -25f)
                lineToRelative(8f, -8f)
                lineToRelative(-56f, -56f)
                quadToRelative(-29f, -29f, -65f, -43.5f)
                reflectiveQuadTo(256f, 276f)
                quadToRelative(-20f, 0f, -38f, 3f)
                reflectiveQuadToRelative(-36f, 9f)
                lineToRelative(42f, 42f)
                close()
            }
        }.build()
        
        return _History_edu!!
    }

private var _History_edu: ImageVector? = null

