package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonHearts: ImageVector
    get() {
        if (_PersonHearts != null) return _PersonHearts!!
        
        _PersonHearts = ImageVector.Builder(
            name = "person-hearts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 1.246f)
                curveToRelative(0.832f, -0.855f, 2.913f, 0.642f, 0f, 2.566f)
                curveToRelative(-2.913f, -1.924f, -0.832f, -3.421f, 0f, -2.566f)
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
                moveTo(15f, 2.165f)
                curveToRelative(0.555f, -0.57f, 1.942f, 0.428f, 0f, 1.711f)
                curveToRelative(-1.942f, -1.283f, -0.555f, -2.281f, 0f, -1.71f)
                close()
            }
        }.build()
        
        return _PersonHearts!!
    }

private var _PersonHearts: ImageVector? = null

