package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Insert_chart: ImageVector
    get() {
        if (_Insert_chart != null) return _Insert_chart!!
        
        _Insert_chart = ImageVector.Builder(
            name = "insert_chart",
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
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                close()
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveToRelative(2f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineTo(7f)
                close()
                moveToRelative(4f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(4f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Insert_chart!!
    }

private var _Insert_chart: ImageVector? = null

