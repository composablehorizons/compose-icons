package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Titlecase: ImageVector
    get() {
        if (_Titlecase != null) return _Titlecase!!
        
        _Titlecase = ImageVector.Builder(
            name = "titlecase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 677f)
                verticalLineToRelative(-333f)
                horizontalLineToRelative(-87f)
                quadToRelative(-14f, 0f, -23.5f, -9f)
                reflectiveQuadToRelative(-9.5f, -23f)
                quadToRelative(0f, -14f, 9.5f, -23f)
                reflectiveQuadToRelative(23.5f, -9f)
                horizontalLineToRelative(243f)
                quadToRelative(14f, 0f, 23f, 9f)
                reflectiveQuadToRelative(9f, 23f)
                quadToRelative(0f, 14f, -9f, 23f)
                reflectiveQuadToRelative(-23f, 9f)
                horizontalLineToRelative(-88f)
                verticalLineToRelative(333f)
                quadToRelative(0f, 14f, -10f, 23.5f)
                reflectiveQuadToRelative(-24f, 9.5f)
                quadToRelative(-14f, 0f, -24f, -9.5f)
                reflectiveQuadTo(344f, 677f)
                close()
                moveToRelative(250f, -215f)
                horizontalLineToRelative(-25f)
                quadToRelative(-12f, 0f, -20.5f, -8.5f)
                reflectiveQuadTo(540f, 433f)
                quadToRelative(0f, -12f, 8.5f, -20.5f)
                reflectiveQuadTo(569f, 404f)
                horizontalLineToRelative(25f)
                verticalLineToRelative(-54f)
                quadToRelative(0f, -14f, 9.5f, -23.5f)
                reflectiveQuadTo(627f, 317f)
                quadToRelative(14f, 0f, 23.5f, 9.5f)
                reflectiveQuadTo(660f, 350f)
                verticalLineToRelative(54f)
                horizontalLineToRelative(45f)
                quadToRelative(12f, 0f, 20.5f, 8.5f)
                reflectiveQuadTo(734f, 433f)
                quadToRelative(0f, 12f, -8.5f, 20.5f)
                reflectiveQuadTo(705f, 462f)
                horizontalLineToRelative(-45f)
                verticalLineToRelative(148f)
                quadToRelative(0f, 23f, 10.5f, 36f)
                reflectiveQuadToRelative(28.5f, 13f)
                horizontalLineToRelative(9f)
                quadToRelative(11f, -1f, 19.5f, 7.5f)
                reflectiveQuadTo(736f, 687f)
                quadToRelative(0f, 14f, -7.5f, 22f)
                reflectiveQuadTo(708f, 719f)
                quadToRelative(-5f, 1f, -10f, 1f)
                horizontalLineToRelative(-10f)
                quadToRelative(-44f, 0f, -69f, -25.5f)
                reflectiveQuadTo(594f, 624f)
                verticalLineToRelative(-162f)
                close()
            }
        }.build()
        
        return _Titlecase!!
    }

private var _Titlecase: ImageVector? = null

