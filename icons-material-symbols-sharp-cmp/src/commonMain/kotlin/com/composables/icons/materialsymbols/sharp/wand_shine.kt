package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wand_shine: ImageVector
    get() {
        if (_Wand_shine != null) return _Wand_shine!!
        
        _Wand_shine = ImageVector.Builder(
            name = "wand_shine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(331f, 309f)
                lineTo(211f, 189f)
                lineToRelative(57f, -57f)
                lineToRelative(120f, 120f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(149f, -95f)
                verticalLineToRelative(-170f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(291f, 535f)
                lineTo(651f, 629f)
                lineToRelative(57f, -57f)
                lineToRelative(120f, 120f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-63f, -440f)
                lineToRelative(-57f, -57f)
                lineToRelative(120f, -120f)
                lineToRelative(57f, 57f)
                lineToRelative(-120f, 120f)
                close()
                moveToRelative(38f, 171f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(80f)
                horizontalLineTo(746f)
                close()
                moveTo(233f, 897f)
                lineTo(63f, 727f)
                lineToRelative(392f, -392f)
                quadToRelative(35f, -35f, 85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(35f, 35f, 35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                lineTo(233f, 897f)
                close()
                moveToRelative(251f, -364f)
                lineToRelative(-14.5f, -14f)
                lineToRelative(-14.5f, -14f)
                lineToRelative(-14f, -14f)
                lineToRelative(-14f, -14f)
                lineToRelative(28f, 28f)
                lineToRelative(29f, 28f)
                close()
                moveTo(233f, 784f)
                lineToRelative(251f, -251f)
                lineToRelative(-57f, -56f)
                lineToRelative(-250f, 250f)
                lineToRelative(56f, 57f)
                close()
            }
        }.build()
        
        return _Wand_shine!!
    }

private var _Wand_shine: ImageVector? = null

