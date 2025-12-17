package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unlicense: ImageVector
    get() {
        if (_Unlicense != null) return _Unlicense!!
        
        _Unlicense = ImageVector.Builder(
            name = "unlicense",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(722f, 608f)
                lineToRelative(-56f, -56f)
                quadToRelative(26f, -32f, 40f, -70f)
                reflectiveQuadToRelative(14f, -82f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-44f, 0f, -82f, 14f)
                reflectiveQuadToRelative(-70f, 40f)
                lineToRelative(-56f, -56f)
                quadToRelative(42f, -36f, 95f, -57f)
                reflectiveQuadToRelative(113f, -21f)
                quadToRelative(133f, 0f, 226.5f, 93.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(0f, 60f, -21f, 113f)
                reflectiveQuadToRelative(-57f, 95f)
                close()
                moveTo(580f, 466f)
                lineTo(414f, 300f)
                quadToRelative(14f, -9f, 31f, -14.5f)
                reflectiveQuadToRelative(35f, -5.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 18f, -5.5f, 35f)
                reflectiveQuadTo(580f, 466f)
                close()
                moveTo(240f, 920f)
                verticalLineToRelative(-308f)
                quadToRelative(-38f, -44f, -59f, -97f)
                reflectiveQuadToRelative(-21f, -115f)
                quadToRelative(0f, -29f, 4.5f, -55.5f)
                reflectiveQuadTo(180f, 292f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-72f, -70f)
                verticalLineToRelative(86f)
                lineToRelative(-240f, -80f)
                lineToRelative(-240f, 80f)
                close()
                moveToRelative(240f, -280f)
                quadToRelative(11f, 0f, 21f, -1f)
                reflectiveQuadToRelative(21f, -3f)
                lineTo(244f, 358f)
                quadToRelative(-2f, 11f, -3f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Unlicense!!
    }

private var _Unlicense: ImageVector? = null

