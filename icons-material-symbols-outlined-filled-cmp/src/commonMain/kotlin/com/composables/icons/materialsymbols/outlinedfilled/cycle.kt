package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cycle: ImageVector
    get() {
        if (_Cycle != null) return _Cycle!!
        
        _Cycle = ImageVector.Builder(
            name = "cycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(314f, 845f)
                quadToRelative(-104f, -48f, -169f, -145f)
                reflectiveQuadTo(80f, 481f)
                quadToRelative(0f, -26f, 2.5f, -51f)
                reflectiveQuadToRelative(8.5f, -49f)
                lineToRelative(-46f, 27f)
                lineToRelative(-40f, -69f)
                lineToRelative(191f, -110f)
                lineToRelative(110f, 190f)
                lineToRelative(-70f, 40f)
                lineToRelative(-54f, -94f)
                quadToRelative(-11f, 27f, -16.5f, 56f)
                reflectiveQuadToRelative(-5.5f, 60f)
                quadToRelative(0f, 97f, 53f, 176.5f)
                reflectiveQuadTo(354f, 775f)
                lineToRelative(-40f, 70f)
                close()
                moveToRelative(306f, -485f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(109f)
                quadToRelative(-46f, -57f, -111f, -88.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-55f, 0f, -104f, 17f)
                reflectiveQuadToRelative(-90f, 48f)
                lineToRelative(-40f, -70f)
                quadToRelative(50f, -35f, 109f, -55f)
                reflectiveQuadToRelative(125f, -20f)
                quadToRelative(79f, 0f, 151f, 29.5f)
                reflectiveQuadTo(760f, 195f)
                verticalLineToRelative(-55f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(220f)
                horizontalLineTo(620f)
                close()
                moveTo(594f, 960f)
                lineTo(403f, 850f)
                lineToRelative(110f, -190f)
                lineToRelative(69f, 40f)
                lineToRelative(-57f, 98f)
                quadToRelative(118f, -17f, 196.5f, -107f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -11f, -0.5f, -20.5f)
                reflectiveQuadTo(797f, 440f)
                horizontalLineToRelative(81f)
                quadToRelative(1f, 10f, 1.5f, 19.5f)
                reflectiveQuadToRelative(0.5f, 20.5f)
                quadToRelative(0f, 135f, -80.5f, 241.5f)
                reflectiveQuadTo(590f, 865f)
                lineToRelative(44f, 26f)
                lineToRelative(-40f, 69f)
                close()
            }
        }.build()
        
        return _Cycle!!
    }

private var _Cycle: ImageVector? = null

