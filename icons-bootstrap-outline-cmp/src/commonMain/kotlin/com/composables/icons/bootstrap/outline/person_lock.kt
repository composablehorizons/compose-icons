package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonLock: ImageVector
    get() {
        if (_PersonLock != null) return _PersonLock!!
        
        _PersonLock = ImageVector.Builder(
            name = "person-lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveTo(8f, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(0f, 5.996f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                reflectiveCurveToRelative(-1f, 0f, -1f, -1f)
                reflectiveCurveToRelative(1f, -4f, 6f, -4f)
                quadToRelative(0.845f, 0.002f, 1.544f, 0.107f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -0.803f, 0.918f)
                arcTo(11f, 11f, 0f, false, false, 8f, 10f)
                curveToRelative(-2.29f, 0f, -3.516f, 0.68f, -4.168f, 1.332f)
                curveToRelative(-0.678f, 0.678f, -0.83f, 1.418f, -0.832f, 1.664f)
                close()
                moveTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _PersonLock!!
    }

private var _PersonLock: ImageVector? = null

