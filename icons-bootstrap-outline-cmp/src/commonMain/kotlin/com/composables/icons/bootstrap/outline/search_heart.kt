package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SearchHeart: ImageVector
    get() {
        if (_SearchHeart != null) return _SearchHeart!!
        
        _SearchHeart = ImageVector.Builder(
            name = "search-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 4.482f)
                curveToRelative(1.664f, -1.673f, 5.825f, 1.254f, 0f, 5.018f)
                curveToRelative(-5.825f, -3.764f, -1.664f, -6.69f, 0f, -5.018f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 6.5f)
                arcToRelative(6.47f, 6.47f, 0f, false, true, -1.258f, 3.844f)
                quadToRelative(0.06f, 0.044f, 0.115f, 0.098f)
                lineToRelative(3.85f, 3.85f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.415f)
                lineToRelative(-3.85f, -3.85f)
                arcToRelative(1f, 1f, 0f, false, true, -0.1f, -0.115f)
                horizontalLineToRelative(0.002f)
                arcTo(6.5f, 6.5f, 0f, true, true, 13f, 6.5f)
                moveTo(6.5f, 12f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 0f, -11f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0f, 11f)
            }
        }.build()
        
        return _SearchHeart!!
    }

private var _SearchHeart: ImageVector? = null

