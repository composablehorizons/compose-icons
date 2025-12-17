package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sentiment_frustrated: ImageVector
    get() {
        if (_Sentiment_frustrated != null) return _Sentiment_frustrated!!
        
        _Sentiment_frustrated = ImageVector.Builder(
            name = "sentiment_frustrated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(391f, 720f)
                quadToRelative(17f, 0f, 32.5f, -6f)
                reflectiveQuadToRelative(30.5f, -14f)
                quadToRelative(6f, -4f, 12.5f, -7f)
                reflectiveQuadToRelative(13.5f, -3f)
                quadToRelative(8f, 0f, 26f, 10f)
                quadToRelative(15f, 8f, 30.5f, 14f)
                reflectiveQuadToRelative(32.5f, 6f)
                quadToRelative(50f, 0f, 80.5f, -35.5f)
                reflectiveQuadTo(680f, 590f)
                quadToRelative(0f, -72f, -49.5f, -111f)
                reflectiveQuadTo(488f, 440f)
                horizontalLineToRelative(-16f)
                quadToRelative(-93f, 0f, -142.5f, 39f)
                reflectiveQuadTo(280f, 590f)
                quadToRelative(0f, 59f, 30.5f, 94.5f)
                reflectiveQuadTo(391f, 720f)
                close()
                moveToRelative(-1f, -60f)
                quadToRelative(-24f, 0f, -37.5f, -18.5f)
                reflectiveQuadTo(339f, 590f)
                quadToRelative(0f, -46f, 32.5f, -68f)
                reflectiveQuadTo(472f, 500f)
                horizontalLineToRelative(15f)
                quadToRelative(68f, 0f, 100f, 22f)
                reflectiveQuadToRelative(32f, 68f)
                quadToRelative(0f, 33f, -13f, 51.5f)
                reflectiveQuadTo(569f, 660f)
                quadToRelative(-12f, 0f, -34f, -12f)
                quadToRelative(-13f, -8f, -26.5f, -13f)
                reflectiveQuadToRelative(-28.5f, -5f)
                quadToRelative(-15f, 0f, -29f, 5f)
                reflectiveQuadToRelative(-27f, 13f)
                quadToRelative(-8f, 5f, -16.5f, 8.5f)
                reflectiveQuadTo(390f, 660f)
                close()
                moveTo(251f, 428f)
                quadToRelative(60f, -24f, 96f, -53f)
                reflectiveQuadToRelative(68f, -79f)
                lineToRelative(-50f, -32f)
                quadToRelative(-26f, 41f, -54.5f, 63f)
                reflectiveQuadTo(228f, 372f)
                lineToRelative(23f, 56f)
                close()
                moveToRelative(457f, 0f)
                lineToRelative(23f, -56f)
                quadToRelative(-53f, -22f, -81f, -44f)
                reflectiveQuadToRelative(-55f, -64f)
                lineToRelative(-50f, 32f)
                quadToRelative(32f, 50f, 68f, 78.5f)
                reflectiveQuadToRelative(95f, 53.5f)
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
        
        return _Sentiment_frustrated!!
    }

private var _Sentiment_frustrated: ImageVector? = null

