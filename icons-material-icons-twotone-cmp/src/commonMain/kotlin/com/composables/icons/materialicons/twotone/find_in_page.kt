package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Find_in_page: ImageVector
    get() {
        if (_Find_in_page != null) return _Find_in_page!!
        
        _Find_in_page = ImageVector.Builder(
            name = "find_in_page",
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
                moveTo(6f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(11.6f)
                lineToRelative(-2.85f, -2.85f)
                curveToRelative(-0.83f, 0.55f, -1.79f, 0.83f, -2.75f, 0.83f)
                curveToRelative(-1.28f, 0f, -2.55f, -0.49f, -3.53f, -1.46f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.11f, 0f, -7.05f)
                curveTo(9.45f, 8.49f, 10.72f, 8f, 12f, 8f)
                curveToRelative(1.28f, 0f, 2.55f, 0.49f, 3.53f, 1.46f)
                curveToRelative(1.71f, 1.71f, 1.92f, 4.34f, 0.64f, 6.28f)
                lineTo(18f, 17.58f)
                verticalLineTo(9f)
                lineToRelative(-5f, -5f)
                horizontalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(4f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                lineToRelative(-6f, -6f)
                close()
                moveToRelative(4f, 15.58f)
                lineToRelative(-1.84f, -1.84f)
                curveToRelative(1.28f, -1.94f, 1.07f, -4.57f, -0.64f, -6.28f)
                curveTo(14.55f, 8.49f, 13.28f, 8f, 12f, 8f)
                curveToRelative(-1.28f, 0f, -2.55f, 0.49f, -3.53f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.11f, 0f, 7.05f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f)
                curveToRelative(0.96f, 0f, 1.92f, -0.28f, 2.75f, -0.83f)
                lineTo(17.6f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(7f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(8.58f)
                close()
                moveToRelative(-3.01f, -4.59f)
                curveToRelative(0f, 0.8f, -0.31f, 1.55f, -0.88f, 2.11f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.88f, -2.11f, 0.88f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.11f, -0.88f)
                curveToRelative(-0.56f, -0.56f, -0.88f, -1.31f, -0.88f, -2.11f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.11f)
                reflectiveCurveTo(11.2f, 10f, 12f, 10f)
                reflectiveCurveToRelative(1.55f, 0.31f, 2.11f, 0.88f)
                curveToRelative(0.57f, 0.56f, 0.88f, 1.31f, 0.88f, 2.11f)
                close()
            }
        }.build()
        
        return _Find_in_page!!
    }

private var _Find_in_page: ImageVector? = null

