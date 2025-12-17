package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.People: ImageVector
    get() {
        if (_People != null) return _People!!
        
        _People = ImageVector.Builder(
            name = "people",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 14f)
                reflectiveCurveToRelative(1f, 0f, 1f, -1f)
                reflectiveCurveToRelative(-1f, -4f, -5f, -4f)
                reflectiveCurveToRelative(-5f, 3f, -5f, 4f)
                reflectiveCurveToRelative(1f, 1f, 1f, 1f)
                close()
                moveToRelative(-7.978f, -1f)
                lineTo(7f, 12.996f)
                curveToRelative(0.001f, -0.264f, 0.167f, -1.03f, 0.76f, -1.72f)
                curveTo(8.312f, 10.629f, 9.282f, 10f, 11f, 10f)
                curveToRelative(1.717f, 0f, 2.687f, 0.63f, 3.24f, 1.276f)
                curveToRelative(0.593f, 0.69f, 0.758f, 1.457f, 0.76f, 1.72f)
                lineToRelative(-0.008f, 0.002f)
                lineToRelative(-0.014f, 0.002f)
                close()
                moveTo(11f, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(3f, -2f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveTo(6.936f, 9.28f)
                arcToRelative(6f, 6f, 0f, false, false, -1.23f, -0.247f)
                arcTo(7f, 7f, 0f, false, false, 5f, 9f)
                curveToRelative(-4f, 0f, -5f, 3f, -5f, 4f)
                quadToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(4.216f)
                arcTo(2.24f, 2.24f, 0f, false, true, 5f, 13f)
                curveToRelative(0f, -1.01f, 0.377f, -2.042f, 1.09f, -2.904f)
                curveToRelative(0.243f, -0.294f, 0.526f, -0.569f, 0.846f, -0.816f)
                moveTo(4.92f, 10f)
                arcTo(5.5f, 5.5f, 0f, false, false, 4f, 13f)
                horizontalLineTo(1f)
                curveToRelative(0f, -0.26f, 0.164f, -1.03f, 0.76f, -1.724f)
                curveToRelative(0.545f, -0.636f, 1.492f, -1.256f, 3.16f, -1.275f)
                close()
                moveTo(1.5f, 5.5f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                moveToRelative(3f, -2f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
            }
        }.build()
        
        return _People!!
    }

private var _People: ImageVector? = null

