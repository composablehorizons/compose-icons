package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SearchHeart: ImageVector
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
                moveTo(6.5f, 13f)
                arcToRelative(6.47f, 6.47f, 0f, false, false, 3.845f, -1.258f)
                horizontalLineToRelative(-0.001f)
                quadToRelative(0.044f, 0.06f, 0.098f, 0.115f)
                lineToRelative(3.85f, 3.85f)
                arcToRelative(1f, 1f, 0f, false, false, 1.415f, -1.414f)
                lineToRelative(-3.85f, -3.85f)
                arcToRelative(1f, 1f, 0f, false, false, -0.115f, -0.1f)
                arcTo(6.47f, 6.47f, 0f, false, false, 13f, 6.5f)
                arcTo(6.5f, 6.5f, 0f, false, false, 6.5f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, 0f, 13f)
                moveToRelative(0f, -8.518f)
                curveToRelative(1.664f, -1.673f, 5.825f, 1.254f, 0f, 5.018f)
                curveToRelative(-5.825f, -3.764f, -1.664f, -6.69f, 0f, -5.018f)
            }
        }.build()
        
        return _SearchHeart!!
    }

private var _SearchHeart: ImageVector? = null

