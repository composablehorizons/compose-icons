package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Note_stack_add: ImageVector
    get() {
        if (_Note_stack_add != null) return _Note_stack_add!!
        
        _Note_stack_add = ImageVector.Builder(
            name = "note_stack_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-441f)
                quadToRelative(0f, -33f, 24f, -56f)
                reflectiveQuadToRelative(57f, -23f)
                horizontalLineToRelative(439f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(287f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(857f, 703f)
                lineTo(703f, 857f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadTo(647f, 880f)
                horizontalLineTo(360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 800f)
                close()
                moveTo(81f, 250f)
                quadToRelative(-6f, -33f, 13f, -59.5f)
                reflectiveQuadToRelative(52f, -32.5f)
                lineToRelative(434f, -77f)
                quadToRelative(32f, -6f, 58f, 13.5f)
                reflectiveQuadToRelative(34f, 51.5f)
                lineToRelative(7f, 31f)
                quadToRelative(5f, 20f, -6f, 32f)
                reflectiveQuadToRelative(-26f, 14f)
                quadToRelative(-15f, 2f, -28.5f, -5.5f)
                reflectiveQuadTo(600f, 190f)
                lineToRelative(-7f, -30f)
                lineToRelative(-433f, 77f)
                lineToRelative(60f, 344f)
                quadToRelative(3f, 17f, -6f, 30.5f)
                reflectiveQuadTo(188f, 628f)
                quadToRelative(-17f, 3f, -30f, -6.5f)
                reflectiveQuadTo(142f, 595f)
                lineTo(81f, 250f)
                close()
                moveToRelative(279f, 110f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(280f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(-280f)
                horizontalLineTo(360f)
                close()
                moveToRelative(220f, 220f)
                close()
                moveToRelative(-40f, 40f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(580f, 740f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(620f, 700f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(740f, 580f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(700f, 540f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(580f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(540f, 460f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(420f, 580f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(460f, 620f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Note_stack_add!!
    }

private var _Note_stack_add: ImageVector? = null

