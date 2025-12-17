package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PersonCheck: ImageVector
    get() {
        if (_PersonCheck != null) return _PersonCheck!!
        
        _PersonCheck = ImageVector.Builder(
            name = "person-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineTo(12.5f, 7.793f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 14f)
                reflectiveCurveToRelative(-1f, 0f, -1f, -1f)
                reflectiveCurveToRelative(1f, -4f, 6f, -4f)
                reflectiveCurveToRelative(6f, 3f, 6f, 4f)
                reflectiveCurveToRelative(-1f, 1f, -1f, 1f)
                close()
                moveToRelative(5f, -6f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
            }
        }.build()
        
        return _PersonCheck!!
    }

private var _PersonCheck: ImageVector? = null

