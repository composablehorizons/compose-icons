package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sports_volleyball: ImageVector
    get() {
        if (_Sports_volleyball != null) return _Sports_volleyball!!
        
        _Sports_volleyball = ImageVector.Builder(
            name = "sports_volleyball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(864f, 368f)
                lineTo(520f, 169f)
                verticalLineToRelative(-87f)
                quadToRelative(123f, 12f, 216f, 90.5f)
                reflectiveQuadTo(864f, 368f)
                close()
                moveTo(270f, 556f)
                verticalLineToRelative(-416f)
                quadToRelative(39f, -23f, 82f, -38f)
                reflectiveQuadToRelative(89f, -20f)
                verticalLineToRelative(375f)
                lineToRelative(-171f, 99f)
                close()
                moveToRelative(-154f, 89f)
                quadToRelative(-18f, -38f, -27f, -79.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -77f, 28f, -147.5f)
                reflectiveQuadTo(190f, 206f)
                verticalLineToRelative(395f)
                lineToRelative(-74f, 44f)
                close()
                moveToRelative(176f, 187f)
                quadToRelative(-42f, -20f, -76f, -50f)
                reflectiveQuadToRelative(-60f, -68f)
                lineToRelative(325f, -188f)
                lineToRelative(171f, 99f)
                lineToRelative(-360f, 207f)
                close()
                moveToRelative(189f, 48f)
                quadToRelative(-23f, 0f, -47f, -2.5f)
                reflectiveQuadTo(388f, 869f)
                lineToRelative(344f, -198f)
                lineToRelative(74f, 41f)
                quadToRelative(-57f, 78f, -142.5f, 123f)
                reflectiveQuadTo(481f, 880f)
                close()
                moveToRelative(364f, -236f)
                lineTo(520f, 457f)
                verticalLineToRelative(-197f)
                lineToRelative(360f, 209f)
                quadToRelative(0f, 46f, -8f, 90f)
                reflectiveQuadToRelative(-27f, 85f)
                close()
            }
        }.build()
        
        return _Sports_volleyball!!
    }

private var _Sports_volleyball: ImageVector? = null

