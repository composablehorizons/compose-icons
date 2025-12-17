package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PersonPlus: ImageVector
    get() {
        if (_PersonPlus != null) return _PersonPlus!!
        
        _PersonPlus = ImageVector.Builder(
            name = "person-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(14f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(13f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _PersonPlus!!
    }

private var _PersonPlus: ImageVector? = null

