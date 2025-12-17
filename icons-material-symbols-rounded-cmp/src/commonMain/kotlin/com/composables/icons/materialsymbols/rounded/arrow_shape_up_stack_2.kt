package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_shape_up_stack_2: ImageVector
    get() {
        if (_Arrow_shape_up_stack_2 != null) return _Arrow_shape_up_stack_2!!
        
        _Arrow_shape_up_stack_2 = ImageVector.Builder(
            name = "arrow_shape_up_stack_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineTo(227f)
                quadToRelative(-20f, 0f, -28f, -18f)
                reflectiveQuadToRelative(5f, -32f)
                lineToRelative(246f, -276f)
                quadToRelative(12f, -14f, 30f, -14f)
                reflectiveQuadToRelative(30f, 14f)
                lineToRelative(246f, 276f)
                quadToRelative(13f, 14f, 5f, 32f)
                reflectiveQuadToRelative(-28f, 18f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 880f)
                close()
                moveToRelative(80f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 720f)
                horizontalLineToRelative(62f)
                lineTo(480f, 560f)
                lineTo(338f, 720f)
                horizontalLineToRelative(62f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 760f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, -480f)
                lineTo(279f, 587f)
                quadToRelative(-6f, 6f, -14f, 9.5f)
                reflectiveQuadToRelative(-16f, 3.5f)
                quadToRelative(-26f, 0f, -36.5f, -23f)
                reflectiveQuadToRelative(6.5f, -43f)
                lineToRelative(231f, -260f)
                quadToRelative(12f, -14f, 30f, -14f)
                reflectiveQuadToRelative(30f, 14f)
                lineToRelative(231f, 260f)
                quadToRelative(17f, 20f, 6.5f, 43f)
                reflectiveQuadTo(711f, 600f)
                quadToRelative(-8f, 0f, -16f, -3f)
                reflectiveQuadToRelative(-14f, -10f)
                lineTo(480f, 360f)
                close()
                moveToRelative(0f, -200f)
                lineTo(279f, 387f)
                quadToRelative(-6f, 6f, -14f, 9.5f)
                reflectiveQuadToRelative(-16f, 3.5f)
                quadToRelative(-26f, 0f, -36.5f, -23f)
                reflectiveQuadToRelative(6.5f, -43f)
                lineToRelative(231f, -260f)
                quadToRelative(12f, -14f, 30f, -14f)
                reflectiveQuadToRelative(30f, 14f)
                lineToRelative(231f, 260f)
                quadToRelative(17f, 20f, 6.5f, 43f)
                reflectiveQuadTo(711f, 400f)
                quadToRelative(-8f, 0f, -16f, -3f)
                reflectiveQuadToRelative(-14f, -10f)
                lineTo(480f, 160f)
                close()
                moveToRelative(0f, 560f)
                close()
            }
        }.build()
        
        return _Arrow_shape_up_stack_2!!
    }

private var _Arrow_shape_up_stack_2: ImageVector? = null

