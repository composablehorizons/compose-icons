package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Metabolism: ImageVector
    get() {
        if (_Metabolism != null) return _Metabolism!!
        
        _Metabolism = ImageVector.Builder(
            name = "metabolism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 720f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-144f)
                quadToRelative(0f, -23f, 31.5f, -39.5f)
                reflectiveQuadTo(440f, 380f)
                quadToRelative(47f, 0f, 78.5f, 16.5f)
                reflectiveQuadTo(550f, 436f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(140f)
                horizontalLineTo(390f)
                close()
                moveToRelative(50f, -360f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveToRelative(0f, 480f)
                quadToRelative(-150f, 0f, -255f, -105f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(8f)
                lineToRelative(73f, -74f)
                lineToRelative(57f, 56f)
                lineToRelative(-170f, 170f)
                lineToRelative(-170f, -170f)
                lineToRelative(57f, -56f)
                lineToRelative(73f, 73f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(1f, 116f, 82.5f, 198f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(57f, 0f, 107f, -21.5f)
                reflectiveQuadToRelative(88f, -58.5f)
                lineToRelative(57f, 57f)
                quadToRelative(-49f, 48f, -113.5f, 75.5f)
                reflectiveQuadTo(440f, 840f)
                close()
            }
        }.build()
        
        return _Metabolism!!
    }

private var _Metabolism: ImageVector? = null

