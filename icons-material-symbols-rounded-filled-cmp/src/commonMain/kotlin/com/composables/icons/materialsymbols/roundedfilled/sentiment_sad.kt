package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sentiment_sad: ImageVector
    get() {
        if (_Sentiment_sad != null) return _Sentiment_sad!!
        
        _Sentiment_sad = ImageVector.Builder(
            name = "sentiment_sad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 460f)
                quadToRelative(65f, 0f, 112f, 44f)
                reflectiveQuadToRelative(56f, 109f)
                quadToRelative(2f, 12f, 11f, 19.5f)
                reflectiveQuadToRelative(21f, 7.5f)
                quadToRelative(12f, 0f, 21.5f, -8f)
                reflectiveQuadToRelative(7.5f, -20f)
                quadToRelative(-10f, -90f, -74.5f, -151f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-90f, 0f, -154.5f, 61f)
                reflectiveQuadTo(251f, 612f)
                quadToRelative(-2f, 12f, 7.5f, 20f)
                reflectiveQuadToRelative(21.5f, 8f)
                quadToRelative(12f, 0f, 21f, -7.5f)
                reflectiveQuadToRelative(11f, -19.5f)
                quadToRelative(9f, -65f, 56f, -109f)
                reflectiveQuadToRelative(112f, -44f)
                close()
                moveToRelative(-58f, -159f)
                quadToRelative(9f, -8f, 8.5f, -20.5f)
                reflectiveQuadTo(420f, 260f)
                quadToRelative(-10f, -8f, -22f, -7f)
                reflectiveQuadToRelative(-22f, 9f)
                quadToRelative(-16f, 14f, -33.5f, 23.5f)
                reflectiveQuadTo(305f, 302f)
                quadToRelative(-12f, 5f, -19.5f, 15f)
                reflectiveQuadToRelative(-5.5f, 23f)
                quadToRelative(2f, 13f, 12f, 20f)
                reflectiveQuadToRelative(21f, 3f)
                quadToRelative(30f, -10f, 58f, -25.5f)
                reflectiveQuadToRelative(51f, -36.5f)
                close()
                moveToRelative(116f, 0f)
                quadToRelative(23f, 21f, 50f, 36f)
                reflectiveQuadToRelative(57f, 25f)
                quadToRelative(12f, 4f, 22.5f, -2.5f)
                reflectiveQuadTo(680f, 340f)
                quadToRelative(2f, -13f, -6f, -23f)
                reflectiveQuadToRelative(-20f, -15f)
                quadToRelative(-19f, -7f, -36.5f, -17f)
                reflectiveQuadTo(584f, 262f)
                quadToRelative(-10f, -8f, -22f, -9f)
                reflectiveQuadToRelative(-22f, 7f)
                quadToRelative(-10f, 8f, -10.5f, 20.5f)
                reflectiveQuadTo(538f, 301f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sentiment_sad!!
    }

private var _Sentiment_sad: ImageVector? = null

