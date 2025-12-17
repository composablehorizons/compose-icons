package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Vape_free: ImageVector
    get() {
        if (_Vape_free != null) return _Vape_free!!
        
        _Vape_free = ImageVector.Builder(
            name = "vape_free",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                quadToRelative(-39f, -10f, -79.5f, -15f)
                reflectiveQuadToRelative(-80.5f, -5f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                quadToRelative(40f, 0f, 80.5f, -5f)
                reflectiveQuadToRelative(79.5f, -15f)
                verticalLineToRelative(120f)
                close()
                moveTo(791f, 904f)
                lineTo(647f, 760f)
                horizontalLineTo(320f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(207f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(82f, -144f)
                lineTo(753f, 640f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-7f)
                close()
                moveToRelative(-453f, -40f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(400f, -120f)
                verticalLineToRelative(-89f)
                quadToRelative(0f, -68f, -46f, -115.5f)
                reflectiveQuadTo(660f, 348f)
                verticalLineToRelative(-60f)
                quadToRelative(31f, 0f, 52.5f, -21.5f)
                reflectiveQuadTo(734f, 214f)
                quadToRelative(0f, -31f, -21.5f, -52.5f)
                reflectiveQuadTo(660f, 140f)
                verticalLineToRelative(-60f)
                quadToRelative(56f, 0f, 95f, 39f)
                reflectiveQuadToRelative(39f, 95f)
                quadToRelative(0f, 28f, -10.5f, 52.5f)
                reflectiveQuadTo(754f, 309f)
                quadToRelative(57f, 27f, 91.5f, 80.5f)
                reflectiveQuadTo(880f, 510f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-100f, 0f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -39f, -23.5f, -60.5f)
                reflectiveQuadTo(641f, 466f)
                horizontalLineToRelative(-62f)
                lineTo(446f, 333f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -56f, 39f, -95f)
                reflectiveQuadToRelative(95f, -39f)
                verticalLineToRelative(60f)
                quadToRelative(-31f, 0f, -52.5f, 19.5f)
                reflectiveQuadTo(506f, 328f)
                quadToRelative(0f, 31f, 21.5f, 55.5f)
                reflectiveQuadTo(580f, 408f)
                horizontalLineToRelative(61f)
                quadToRelative(57f, 0f, 98f, 36f)
                reflectiveQuadToRelative(41f, 90f)
                verticalLineToRelative(66f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Vape_free!!
    }

private var _Vape_free: ImageVector? = null

