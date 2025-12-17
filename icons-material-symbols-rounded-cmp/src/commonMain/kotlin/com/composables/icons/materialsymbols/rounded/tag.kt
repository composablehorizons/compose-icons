package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 640f)
                lineToRelative(-33f, 131f)
                quadToRelative(-3f, 13f, -13f, 21f)
                reflectiveQuadToRelative(-24f, 8f)
                quadToRelative(-19f, 0f, -31f, -15f)
                reflectiveQuadToRelative(-7f, -33f)
                lineToRelative(28f, -112f)
                horizontalLineTo(171f)
                quadToRelative(-20f, 0f, -32f, -15.5f)
                reflectiveQuadToRelative(-7f, -34.5f)
                quadToRelative(3f, -14f, 14f, -22f)
                reflectiveQuadToRelative(25f, -8f)
                horizontalLineToRelative(129f)
                lineToRelative(40f, -160f)
                horizontalLineTo(231f)
                quadToRelative(-20f, 0f, -32f, -15.5f)
                reflectiveQuadToRelative(-7f, -34.5f)
                quadToRelative(3f, -14f, 14f, -22f)
                reflectiveQuadToRelative(25f, -8f)
                horizontalLineToRelative(129f)
                lineToRelative(33f, -131f)
                quadToRelative(3f, -13f, 13f, -21f)
                reflectiveQuadToRelative(24f, -8f)
                quadToRelative(19f, 0f, 31f, 15f)
                reflectiveQuadToRelative(7f, 33f)
                lineToRelative(-28f, 112f)
                horizontalLineToRelative(160f)
                lineToRelative(33f, -131f)
                quadToRelative(3f, -13f, 13f, -21f)
                reflectiveQuadToRelative(24f, -8f)
                quadToRelative(19f, 0f, 31f, 15f)
                reflectiveQuadToRelative(7f, 33f)
                lineToRelative(-28f, 112f)
                horizontalLineToRelative(109f)
                quadToRelative(20f, 0f, 32f, 15.5f)
                reflectiveQuadToRelative(7f, 34.5f)
                quadToRelative(-3f, 14f, -14f, 22f)
                reflectiveQuadToRelative(-25f, 8f)
                horizontalLineTo(660f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(109f)
                quadToRelative(20f, 0f, 32f, 15.5f)
                reflectiveQuadToRelative(7f, 34.5f)
                quadToRelative(-3f, 14f, -14f, 22f)
                reflectiveQuadToRelative(-25f, 8f)
                horizontalLineTo(600f)
                lineToRelative(-33f, 131f)
                quadToRelative(-3f, 13f, -13f, 21f)
                reflectiveQuadToRelative(-24f, 8f)
                quadToRelative(-19f, 0f, -31f, -15f)
                reflectiveQuadToRelative(-7f, -33f)
                lineToRelative(28f, -112f)
                horizontalLineTo(360f)
                close()
                moveToRelative(20f, -80f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, -160f)
                horizontalLineTo(420f)
                lineToRelative(-40f, 160f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

