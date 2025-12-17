package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sentiment_excited: ImageVector
    get() {
        if (_Sentiment_excited != null) return _Sentiment_excited!!
        
        _Sentiment_excited = ImageVector.Builder(
            name = "sentiment_excited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, 180f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(340f, 280f)
                quadToRelative(-38f, 0f, -67.5f, 27.5f)
                reflectiveQuadTo(231f, 383f)
                lineToRelative(58f, 14f)
                quadToRelative(6f, -26f, 20f, -41.5f)
                reflectiveQuadToRelative(31f, -15.5f)
                quadToRelative(17f, 0f, 31f, 15.5f)
                reflectiveQuadToRelative(20f, 41.5f)
                lineToRelative(58f, -14f)
                quadToRelative(-12f, -48f, -41.5f, -75.5f)
                reflectiveQuadTo(340f, 280f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-38f, 0f, -67.5f, 27.5f)
                reflectiveQuadTo(511f, 383f)
                lineToRelative(58f, 14f)
                quadToRelative(6f, -26f, 20f, -41.5f)
                reflectiveQuadToRelative(31f, -15.5f)
                quadToRelative(17f, 0f, 31f, 15.5f)
                reflectiveQuadToRelative(20f, 41.5f)
                lineToRelative(58f, -14f)
                quadToRelative(-12f, -48f, -41.5f, -75.5f)
                reflectiveQuadTo(620f, 280f)
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
        
        return _Sentiment_excited!!
    }

private var _Sentiment_excited: ImageVector? = null

