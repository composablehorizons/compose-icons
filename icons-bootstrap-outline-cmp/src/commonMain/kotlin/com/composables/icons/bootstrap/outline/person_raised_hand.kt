package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonRaisedHand: ImageVector
    get() {
        if (_PersonRaisedHand != null) return _PersonRaisedHand!!
        
        _PersonRaisedHand = ImageVector.Builder(
            name = "person-raised-hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 6.207f)
                verticalLineToRelative(9.043f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, 0.5f, 0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(6.5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(6.236f)
                arcToRelative(1f, 1f, 0f, false, true, -0.447f, -0.106f)
                lineToRelative(-0.33f, -0.165f)
                arcTo(0.83f, 0.83f, 0f, false, true, 5f, 2.488f)
                verticalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.083f)
                curveToRelative(0f, 0.715f, 0.404f, 1.37f, 1.044f, 1.689f)
                lineTo(5.5f, 5f)
                curveToRelative(0.32f, 0.32f, 0.5f, 0.754f, 0.5f, 1.207f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
            }
        }.build()
        
        return _PersonRaisedHand!!
    }

private var _PersonRaisedHand: ImageVector? = null

