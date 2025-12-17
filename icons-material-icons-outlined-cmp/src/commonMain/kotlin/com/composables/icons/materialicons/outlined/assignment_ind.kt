package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Assignment_ind: ImageVector
    get() {
        if (_Assignment_ind != null) return _Assignment_ind!!
        
        _Assignment_ind = ImageVector.Builder(
            name = "assignment_ind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineToRelative(-4.18f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveToRelative(-2.4f, 0.84f, -2.82f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, -0.25f)
                curveToRelative(0.22f, 0f, 0.41f, 0.1f, 0.55f, 0.25f)
                curveToRelative(0.12f, 0.13f, 0.2f, 0.31f, 0.2f, 0.5f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0f, -0.19f, 0.08f, -0.37f, 0.2f, -0.5f)
                curveToRelative(0.14f, -0.15f, 0.33f, -0.25f, 0.55f, -0.25f)
                close()
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveToRelative(0f, 4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(-6f, 6.47f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0f, -2.5f, -3.97f, -3.58f, -6f, -3.58f)
                reflectiveCurveToRelative(-6f, 1.07f, -6f, 3.58f)
                close()
                moveTo(8.31f, 16f)
                curveToRelative(0.69f, -0.56f, 2.38f, -1.12f, 3.69f, -1.12f)
                reflectiveCurveToRelative(3.01f, 0.56f, 3.69f, 1.12f)
                horizontalLineTo(8.31f)
                close()
            }
        }.build()
        
        return _Assignment_ind!!
    }

private var _Assignment_ind: ImageVector? = null

