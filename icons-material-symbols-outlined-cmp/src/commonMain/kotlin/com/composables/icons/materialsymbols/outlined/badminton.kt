package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Badminton: ImageVector
    get() {
        if (_Badminton != null) return _Badminton!!
        
        _Badminton = ImageVector.Builder(
            name = "badminton",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(337f, 550f)
                quadToRelative(55f, 1f, 94f, -37.5f)
                reflectiveQuadToRelative(39f, -94.5f)
                quadToRelative(0f, -29f, -13.5f, -54.5f)
                reflectiveQuadTo(422f, 318f)
                quadToRelative(-38f, -38f, -91.5f, -58f)
                reflectiveQuadTo(223f, 240f)
                quadToRelative(-31f, 0f, -47f, 15.5f)
                reflectiveQuadTo(160f, 300f)
                quadToRelative(0f, 53f, 16.5f, 103.5f)
                reflectiveQuadTo(229f, 493f)
                quadToRelative(22f, 23f, 49f, 40f)
                reflectiveQuadToRelative(59f, 17f)
                close()
                moveToRelative(347f, -228f)
                lineTo(557f, 195f)
                lineToRelative(255f, -121f)
                lineToRelative(18f, 176f)
                lineToRelative(-146f, 72f)
                close()
                moveToRelative(124f, 72f)
                quadToRelative(-17f, 8f, -35.5f, 4.5f)
                reflectiveQuadTo(742f, 381f)
                lineToRelative(-14f, -15f)
                lineToRelative(109f, -52f)
                lineToRelative(2f, 20f)
                quadToRelative(3f, 19f, -5.5f, 35.5f)
                reflectiveQuadTo(808f, 394f)
                close()
                moveTo(80f, 300f)
                quadToRelative(0f, -66f, 37.5f, -103f)
                reflectiveQuadTo(223f, 160f)
                quadToRelative(71f, 0f, 139f, 27f)
                reflectiveQuadToRelative(119f, 78f)
                quadToRelative(31f, 31f, 49.5f, 70f)
                reflectiveQuadToRelative(18.5f, 83f)
                quadToRelative(0f, 32f, -9.5f, 62f)
                reflectiveQuadTo(510f, 535f)
                lineToRelative(289f, 289f)
                lineToRelative(-56f, 56f)
                lineToRelative(-289f, -289f)
                quadToRelative(-26f, 19f, -55.5f, 29.5f)
                reflectiveQuadTo(337f, 630f)
                quadToRelative(-48f, -1f, -90.5f, -23f)
                reflectiveQuadTo(172f, 548f)
                quadToRelative(-45f, -51f, -68.5f, -115f)
                reflectiveQuadTo(80f, 300f)
                close()
                moveToRelative(235f, 95f)
                close()
            }
        }.build()
        
        return _Badminton!!
    }

private var _Badminton: ImageVector? = null

