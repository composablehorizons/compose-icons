package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                reflectiveCurveToRelative(3f, -5.5f, 8f, -5.5f)
                reflectiveCurveTo(16f, 8f, 16f, 8f)
                reflectiveCurveToRelative(-3f, 5.5f, -8f, 5.5f)
                reflectiveCurveTo(0f, 8f, 0f, 8f)
                moveToRelative(8f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

