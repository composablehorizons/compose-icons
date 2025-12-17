package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonHeart: ImageVector
    get() {
        if (_PersonHeart != null) return _PersonHeart!!
        
        _PersonHeart = ImageVector.Builder(
            name = "person-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveToRelative(-9f, 8f)
                curveToRelative(0f, 1f, 1f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                reflectiveCurveToRelative(1f, 0f, 1f, -1f)
                reflectiveCurveToRelative(-1f, -4f, -6f, -4f)
                reflectiveCurveToRelative(-6f, 3f, -6f, 4f)
                moveToRelative(13.5f, -8.09f)
                curveToRelative(1.387f, -1.425f, 4.855f, 1.07f, 0f, 4.277f)
                curveToRelative(-4.854f, -3.207f, -1.387f, -5.702f, 0f, -4.276f)
                close()
            }
        }.build()
        
        return _PersonHeart!!
    }

private var _PersonHeart: ImageVector? = null

