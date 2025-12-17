package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Countertops: ImageVector
    get() {
        if (_Countertops != null) return _Countertops!!
        
        _Countertops = ImageVector.Builder(
            name = "countertops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                verticalLineTo(10f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
                moveTo(6f, 18f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                horizontalLineTo(6f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        
        return _Countertops!!
    }

private var _Countertops: ImageVector? = null

