package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonCircle: ImageVector
    get() {
        if (_PersonCircle != null) return _PersonCircle!!
        
        _PersonCircle = ImageVector.Builder(
            name = "person-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 6f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
                moveToRelative(8f, -7f)
                arcToRelative(7f, 7f, 0f, false, false, -5.468f, 11.37f)
                curveTo(3.242f, 11.226f, 4.805f, 10f, 8f, 10f)
                reflectiveCurveToRelative(4.757f, 1.225f, 5.468f, 2.37f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
            }
        }.build()
        
        return _PersonCircle!!
    }

private var _PersonCircle: ImageVector? = null

