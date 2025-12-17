package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Readiness_score: ImageVector
    get() {
        if (_Readiness_score != null) return _Readiness_score!!
        
        _Readiness_score = ImageVector.Builder(
            name = "readiness_score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(295f, 841f)
                quadToRelative(-36f, -1f, -68.5f, -18.5f)
                reflectiveQuadTo(165f, 771f)
                quadToRelative(-40f, -48f, -62.5f, -114.5f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 237f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(83f, 0f, 156f, 32f)
                reflectiveQuadToRelative(127f, 87f)
                quadToRelative(54f, 55f, 85.5f, 129f)
                reflectiveQuadTo(880f, 527f)
                quadToRelative(0f, 77f, -25f, 144f)
                reflectiveQuadToRelative(-71f, 113f)
                quadToRelative(-28f, 28f, -59f, 42.5f)
                reflectiveQuadTo(662f, 841f)
                quadToRelative(-18f, 0f, -36f, -4.5f)
                reflectiveQuadTo(590f, 823f)
                lineToRelative(-56f, -28f)
                quadToRelative(-12f, -6f, -25.5f, -9f)
                reflectiveQuadToRelative(-28.5f, -3f)
                quadToRelative(-15f, 0f, -28.5f, 3f)
                reflectiveQuadToRelative(-25.5f, 9f)
                lineToRelative(-56f, 28f)
                quadToRelative(-19f, 10f, -37.5f, 14.5f)
                reflectiveQuadTo(295f, 841f)
                close()
                moveToRelative(185f, -241f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -8f, -1.5f, -16f)
                reflectiveQuadToRelative(-4.5f, -16f)
                lineToRelative(50f, -67f)
                quadToRelative(10f, 13f, 17.5f, 27.5f)
                reflectiveQuadTo(634f, 480f)
                horizontalLineToRelative(82f)
                quadToRelative(-15f, -88f, -81.5f, -144f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-88f, 0f, -155f, 56.5f)
                reflectiveQuadTo(244f, 480f)
                horizontalLineToRelative(82f)
                quadToRelative(14f, -54f, 57f, -87f)
                reflectiveQuadToRelative(97f, -33f)
                quadToRelative(17f, 0f, 32f, 3f)
                reflectiveQuadToRelative(29f, 9f)
                lineToRelative(-51f, 69f)
                quadToRelative(-2f, 0f, -5f, -0.5f)
                reflectiveQuadToRelative(-5f, -0.5f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Readiness_score!!
    }

private var _Readiness_score: ImageVector? = null

