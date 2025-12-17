package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dinner_dining: ImageVector
    get() {
        if (_Dinner_dining != null) return _Dinner_dining!!
        
        _Dinner_dining = ImageVector.Builder(
            name = "dinner_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(800f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(-40f, -120f)
                quadToRelative(6f, -18f, 16f, -34f)
                reflectiveQuadToRelative(24f, -30f)
                verticalLineToRelative(-296f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 200f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(60f)
                horizontalLineTo(480f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(244f)
                quadToRelative(14f, 2f, 28f, 6f)
                reflectiveQuadToRelative(26f, 12f)
                quadToRelative(26f, -65f, 83f, -103.5f)
                reflectiveQuadTo(583f, 480f)
                quadToRelative(90f, 0f, 153.5f, 61.5f)
                reflectiveQuadTo(800f, 692f)
                verticalLineToRelative(28f)
                horizontalLineTo(120f)
                close()
                moveToRelative(200f, -510f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(0f, 90f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(-100f, -90f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(0f, 90f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(0f, 314f)
                quadToRelative(10f, -5f, 19.5f, -7.5f)
                reflectiveQuadTo(260f, 602f)
                verticalLineToRelative(-242f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(254f)
                close()
            }
        }.build()
        
        return _Dinner_dining!!
    }

private var _Dinner_dining: ImageVector? = null

