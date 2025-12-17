package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cell_tower: ImageVector
    get() {
        if (_Cell_tower != null) return _Cell_tower!!
        
        _Cell_tower = ImageVector.Builder(
            name = "cell_tower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(196f, 684f)
                quadToRelative(-57f, -60f, -86.5f, -133f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -78f, 29.5f, -151f)
                reflectiveQuadTo(196f, 116f)
                lineToRelative(48f, 48f)
                quadToRelative(-48f, 48f, -72f, 110.5f)
                reflectiveQuadTo(148f, 400f)
                quadToRelative(0f, 63f, 24f, 125.5f)
                reflectiveQuadTo(244f, 636f)
                lineToRelative(-48f, 48f)
                close()
                moveToRelative(96f, -96f)
                quadToRelative(-39f, -39f, -59.5f, -88f)
                reflectiveQuadTo(212f, 400f)
                quadToRelative(0f, -51f, 20.5f, -100f)
                reflectiveQuadToRelative(59.5f, -88f)
                lineToRelative(48f, 48f)
                quadToRelative(-30f, 27f, -45f, 64f)
                reflectiveQuadToRelative(-15f, 76f)
                quadToRelative(0f, 36f, 15f, 73f)
                reflectiveQuadToRelative(45f, 67f)
                lineToRelative(-48f, 48f)
                close()
                moveTo(280f, 880f)
                lineToRelative(135f, -405f)
                quadToRelative(-16f, -14f, -25.5f, -33f)
                reflectiveQuadToRelative(-9.5f, -42f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 23f, -9.5f, 42f)
                reflectiveQuadTo(545f, 475f)
                lineTo(680f, 880f)
                horizontalLineToRelative(-80f)
                lineToRelative(-26f, -80f)
                horizontalLineTo(387f)
                lineToRelative(-27f, 80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(133f, -160f)
                horizontalLineToRelative(134f)
                lineToRelative(-67f, -200f)
                lineToRelative(-67f, 200f)
                close()
                moveToRelative(255f, -132f)
                lineToRelative(-48f, -48f)
                quadToRelative(30f, -27f, 45f, -64f)
                reflectiveQuadToRelative(15f, -76f)
                quadToRelative(0f, -36f, -15f, -73f)
                reflectiveQuadToRelative(-45f, -67f)
                lineToRelative(48f, -48f)
                quadToRelative(39f, 39f, 58f, 88f)
                reflectiveQuadToRelative(22f, 100f)
                quadToRelative(0f, 51f, -20.5f, 100f)
                reflectiveQuadTo(668f, 588f)
                close()
                moveToRelative(96f, 96f)
                lineToRelative(-48f, -48f)
                quadToRelative(48f, -48f, 72f, -110.5f)
                reflectiveQuadTo(812f, 400f)
                quadToRelative(0f, -63f, -24f, -125.5f)
                reflectiveQuadTo(716f, 164f)
                lineToRelative(48f, -48f)
                quadToRelative(57f, 60f, 86.5f, 133f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 78f, -28f, 151f)
                reflectiveQuadToRelative(-88f, 133f)
                close()
            }
        }.build()
        
        return _Cell_tower!!
    }

private var _Cell_tower: ImageVector? = null

